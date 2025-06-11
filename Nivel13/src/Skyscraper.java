public class Skyscraper {
    public String status;

    public void Skyscraper(){

        this.status = status;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        skyscraper.setStatus("The skyscraper was built.");
        System.out.println(skyscraper.getStatus());
    }
}