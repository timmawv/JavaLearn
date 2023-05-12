package avlyakulov.timur.epam.chapter_11.example.arraylist.order;

    public class Order extends Entity {
        private long orderId;
        private double amount;
        public Order() {
        }
        public Order(long orderId, double amount) {
            this.orderId = orderId;
            this.amount = amount;
        }
        public long getOrderId() {
            return orderId;
        }
        public void setOrderId(long orderId) {
            this.orderId = orderId;
        }
        public double getAmount() {
            return amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Order order = (Order) o;
            if (orderId != order.orderId) return false;
            return Double.compare(order.amount, amount) == 0;
        }
        public int hashCode() {
            int result;
            long temp;
            result = (int) (orderId ^ (orderId >>> 32));
            temp = Double.doubleToLongBits(amount);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
        public String toString() {
            final StringBuilder sb = new StringBuilder("Order{");
            sb.append("orderId=").append(orderId).append(", amount=").append(amount);
            sb.append('}');
            return sb.toString();
        }
    }