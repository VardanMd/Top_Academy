package Homework.Strings;
//public static int indexOf(char c , int fromIndex) - возвращает index первого вхождения начиная с fromIndex в противном случаи -1
//public static int lastIndexOf(char c) - возвращает index первого вхождения c конца в противном случаи -1
//public static int lastIndexOf(String c) - возвращает index первого вхождения c конца  в противном случаи -1
public class Main2 {

  public static int lastIndexOf(String str, char c) {
    for (int i = str.length()-1; i >=0; i--) {
      if (str.charAt(i) == c) {
        return i;
      }
    }
    return -1;
  }

  public static int lastIndexOf(String str, String s) { //S - второе слово, всем время начинаем проверят ьс 0

    boolean isHave = true;
    for (int i = str.length()-1; i >=0; i--) {
      if (str.charAt(i) == s.charAt(str.length()-1)) { //Проверяем текущий индекс i с s[0]
        // System.out.println("Start index => " + start + " ; " + str.charAt(start));
        for (int j = s.length()-1; j >=0; j--) {
          if ((i + j) >= str.length() || str.charAt(i + j) != s.charAt(j)) { //i+j увеличиваем индекс, с которого проверяем
            isHave = false;
            break;
          }
        }
        if (isHave) {
          return i;
        } else {
          isHave = true;
        }
      }
    }
    return -1;
  }


  public static int indexOf(String str, int fromIndex) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == fromIndex) {
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    String name1 = "Farid";
    String name2 = "Farid";
    System.out.println(lastIndexOf(name1, 'd'));
    System.out.println(lastIndexOf(name1, name2));
  }

}
