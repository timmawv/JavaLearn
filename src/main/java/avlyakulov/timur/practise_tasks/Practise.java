package avlyakulov.timur.practise_tasks;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.StdConverter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Practise {

    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {

        ObjectMapper objectMapper = new ObjectMapper();
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("weather.json");
        assert resourceAsStream != null;
        String line;
        String json = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resourceAsStream))) {
            while ((line = reader.readLine()) != null) {
                json = json.concat(line);
            }
        }
        System.out.println(json);
        WeatherCityDto weatherCityDto = objectMapper.readValue(json, new TypeReference<>() {
        });
        System.out.println(weatherCityDto);
//        WeatherCityDto city = objectMapper.treeToValue(jsonNode, WeatherCityDto.class);
    }
}

@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
class WeatherCityDto {

    private Weather weather;

    @JsonProperty(value = "main")
    private Temperature temperature;

    private String visibility;

    private Wind wind;

    @JsonProperty(value = "sys")
    private SolarCycle solarCycle;

    private String country;

    private boolean favorite;

    @JsonProperty(value = "weather")
    public void setWeather(List<Weather> weatherList) {
        this.weather = weatherList.get(0);
    }
}

@ToString
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
class Temperature {

    private String temp;

    @JsonProperty(value = "feels_like")
    private String feelsLike;

    @JsonProperty(value = "temp_min")
    private String temperatureMin;

    @JsonProperty(value = "temp_max")
    private String temperatureMax;

    private String humidity;
}

@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
class Wind {

    private String speed;

    @JsonProperty(value = "deg")
    private String degree;

    @JsonProperty
    public void setSpeed(String speed) {
        this.speed = speed.concat(" m/s");
    }
}

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
class Weather {


    private String main;


    private String description;


    private String icon;
}

@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
class SolarCycle {

    private String country;

    @JsonDeserialize(converter = TimeMilliConverter.class)
    private String sunrise;

    @JsonDeserialize(converter = TimeMilliConverter.class)
    private String sunset;
}

class TimeMilliConverter extends StdConverter<String, String> {

    @Override
    public String convert(String timeMilli) {
        long time = Long.parseLong(timeMilli);

        LocalDateTime dateTime = Instant.ofEpochSecond(time)
                .atZone(ZoneId.systemDefault()).toLocalDateTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return dateTime.format(formatter);
    }
}