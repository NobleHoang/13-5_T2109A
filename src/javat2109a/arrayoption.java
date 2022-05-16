package javat2109a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 class cake {
    public String cake;
    public int price;

    public cake(String cake, int price) {
        this.cake = cake;
        this.price = price;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "cake{" +
                "cake='" + cake + '\'' +
                ", price=" + price +
                '}';
    }
}
    public class arrayoption {
        public static void main(String[] args) {
            List<cake> c1 = new ArrayList<>();
            c1.add(new cake("Banhmy",200000));
            c1.add(new cake("Apple cake",40000));
            c1.add(new cake("Donut cake",70000));
            c1.add(new cake("Tiramisu",20000));
            c1.add(new cake("Mochi ",40000));
            System.out.println("Top 5 most delicious cakes : "+c1);
            //element
            cake choosecake=c1.get(3);
            cake displaycakre4=c1.get(c1.size()-2);
            //remove
            c1.remove(c1.size()-1);
            //fine cake
            System.out.println(c1.contains("Banhmy"));
            System.out.println(c1.indexOf("Mochi"));
            System.out.println(c1.lastIndexOf("cake"));
            //cake sort
            c1.sort(new Comparator<cake>() {
                @Override
                public int compare(cake o1, cake o2) {
                    return 0;
                }
            });

        }
    }

