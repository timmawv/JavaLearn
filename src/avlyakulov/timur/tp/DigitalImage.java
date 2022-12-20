package avlyakulov.timur.tp;



import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;

public class DigitalImage  extends JFrame{
    private static final long serialVersionUID = 1L;
    private final int width = 1080;
    private final int height =1080;
    private Image img;
    private int imgW = 1080;
    private int imgH = 1080;

    private int x1=0, y1=0;
    private int x2 = imgW, y2 = imgH;
    private Canvas canvas = null;
    private JMenuBar menuBar = null;
    // угол поворота картинки
    private int m_angle = 0;
    public DigitalImage()
    {
        super();
        init();
    }
    private void init()
    {
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Установить панель формы как объект панели рисования
        canvas = new Canvas();
        this.setContentPane(canvas);
        this.setTitle ( "Малюнок");

        // Получить картинки
        URL url = DigitalImage.class.getResource("song.jpg");
        img = Toolkit.getDefaultToolkit().getImage(url);

        // Создание объекта панели меню
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        // Создать меню
        JMenu menu = new JMenu ("Геометричне перетворення");
        menuBar.add(menu);

        // Создать пункт меню
        JMenuItem Item1 = new JMenuItem ("Поворот зображення");
        Item1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Graphics2D g = (Graphics2D) getGraphics();
                m_angle = m_angle+15;
                g.rotate(Math.toRadians(m_angle));

                // Здесь происходит инкапсуляция данных между объектом артборда и объектом фрейма, и вам нужно передать указатель для работы с артбордом в кадре
                g.drawImage(img, 0, 0, imgW, imgH, canvas);
            }
        });
        menu.add(Item1);

        // Создать меню
        JMenu Item2 = new JMenu ("Відображення зображення");
        menu.add(Item2);

        // Элемент меню направления разворота
        JMenuItem childMenu1 = new JMenuItem ("Горизонтальний");
        childMenu1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // В горизонтальном направлении изменяется только отношение отображения x-направления между исходным прямоугольником и целевым прямоугольником, то есть значение x.
                Graphics g = getGraphics();
                x1 = Math.abs(x1 - imgW);
                x2 = Math.abs(x2 - imgW);
                g.drawImage(img,0,0 ,imgW,imgH, x1,y1,x2,y2,canvas);
            }
        });
        JMenuItem childMenu2 = new JMenuItem ("Вертикальний");
        childMenu2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // В вертикальном направлении изменяется только отношение отображения y-направления между исходным прямоугольником и целевым прямоугольником, то есть значение y.
                Graphics g = getGraphics();
                y1 = Math.abs(y1 - imgH);
                y2 = Math.abs(y2 - imgH);
                g.drawImage(img,0,0 ,imgW,imgH, x1,y1,x2,y2,canvas);
            }
        });
        Item2.add(childMenu1);
        Item2.add(childMenu2);

        // Преобразование ходьбы
        JMenuItem Item3 = new JMenuItem ("Невідповідність зображення");
        Item3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Graphics2D g = (Graphics2D) getGraphics();
                g.shear(0.3,0);
                g.drawImage(img, 0, 0, imgW, imgH, canvas);
            }
        });
        menu.add(Item3);
    }

    public static void main(String[] args)
    {
        new DigitalImage().setVisible(true);
    }
    class Canvas extends JPanel
    {
        private static final long serialVersionUID = 1678373920467727747L;
        public void paint(Graphics g)
        {
            super.paint(g);
            g.drawImage(img, 0,0, width, height, this);
        }
    }

}
