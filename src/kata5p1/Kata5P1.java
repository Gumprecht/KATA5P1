package kata5p1;


public class Kata5P1 {

    
    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
    }
}
    
//    private static void connect() {
//        Connection conn = null;
//        try {
//            String url = "jdbc:sqlite:Kata5.db";
//            conn = DriverManager.getConnection(url);
//            System.out.println("Connexión a SQLite establecida");
//            
//        }catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }finally{
//            try{
//                if (conn != null) {
//                    conn.close();
//                }
//            }catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//                }
//            }
//        }
    

    

