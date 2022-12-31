public class GeolacationCastle {
    public static void main(String[] args) {
        double latitude= 54.38;
        double longitude= 24.56;
        showCastleGeolocation(latitude,longitude);
    }
    static void showCastleGeolocation(double x, double y){
        System.out.println("Trakai is a castle  is located by "+x+
                " north latitude"+" and "+y+" east longitude");
    }

}
