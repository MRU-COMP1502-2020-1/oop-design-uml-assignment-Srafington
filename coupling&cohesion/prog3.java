// None of the methods in the MyReader class rely on member variables, 
// and as such could be made static 
class MyReader {
     // -------------- functions related to read resource

     // read the resource from disk
     public static String readFromDisk(String fileName) {
          return "data of " + fileName;
     }

     // read the resource from web
     public static String readFromWeb(String url) {
          return "data of " + url;
     }

     // read the resource from network
     public static String readFromNetwork(String networkAddress) {
          return "data of " + networkAddress;
     }

}

// The following unrelated methods may have use to a network reader, however
// they are not closely related to the reader. It would be useful to move them
// to a utility class, and make them static as they need no member variables
class networkUtils {
     // -------------- unrelated functions
     public static boolean validateLocation(String pathIP) {
          return ping(pathIP) && checkFTP(pathIP);
     }

     private static boolean checkFTP(String pathIP) {
          return true;
     }

     private static boolean ping(String pathIP) {
          return true;
     }
}