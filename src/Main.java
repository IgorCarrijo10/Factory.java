 class factory {
     public static void main(String[] args){
         Polygon Triangle = PolygonFactory.cratePolygon(3);
         System.out.println(String.format("%d - %s", 3, Triangle.getDescription()));

         Polygon Square = PolygonFactory.cratePolygon(4);
         System.out.println(String.format("%d - %s", 4, Square.getDescription()));

         Polygon Pentagon = PolygonFactory.cratePolygon(5);
         System.out.println(String.format("%d - %s", 5, Pentagon.getDescription()));

         Polygon NoPolygon = PolygonFactory.cratePolygon(0);
         System.out.println(String.format("%d - %s", 0, NoPolygon.getDescription()));
    }
}