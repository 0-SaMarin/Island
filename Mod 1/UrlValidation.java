public class UrlValidation {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        String answer = "";
        if (url.startsWith("https")){
            answer = "https";
        }else if (url.startsWith("http")){
            answer = "http";
        }else{
            answer = "desconocido";
        }
        return answer;
    }

    public static String checkDomainExtension(String url) {
        String answer = "";
        if(url.endsWith(".com")){
            answer = ".com";
        } else if (url.endsWith(".net")) {
            answer = ".net";
        } else if (url.endsWith(".org")) {
            answer = ".org";
        }else if (url.endsWith(".us")){
            answer = ".us";
        }else{
            answer = "desconocido";
        }
        return answer;
    }
}
