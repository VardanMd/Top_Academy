package Homework.Exceptns;
//Применить Exception в тех методах где это необхадимо

//+) public static char charAt(int index)  - возвращает символ строки по указанному index-у
//+) public static boolean equals(String str)- возвращает true если str == arr по значению
//+) public static String toLowerCase()- возвращает string все символы в нижнем регистре
//+) public static String toUpperCase()- возвращает string все символы в верхнем регистре
//+) public static int indexOf(char c) - возвращает index первого вхождения в противном случае -1
//+) public static int indexOf(String c) - возвращает index первого вхождения в противном случае -1
//7) public static int indexOfchar c , int fromIndex) - возвращает index первого вхождения начиная с fromIndex в противном случаи -1
//8) public static int lastIndexOf(char c) - возвращает index первого вхождения c конца в противном случаи -1
//9) public static int lastIndexOf(String c) - возвращает index первого вхождения c конца  в противном случаи -1
//+) public static String trim()- возвращает string, удалив пробелы слева и справа
//+) public static boolean startsWith(String str)- возвращает true если строка начинается на str в 12) противном случаи false
//+) public static boolean endsWith(String str)- возвращает true если строка заканчивается на str в противном случаи false
//+) public static boolean equalsIgnoreCase(String str)- возвращает true если строка ровна str не учитывая регистр
//+) public static char[] toCharArray()- возвращает массив символов
public class Main {
  //static public String name = "Farid";

  public static char[] toCharArray(
      String str) { //Если передаем параметр в метод, то тогда String name переносим в метод Main
    //return str.toCharArray();//готовый метод
    char[] arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i);
    }
    return arr;
  }

  public static char charAt(String str, int index) {
//    int count = 0;
//    for (char c:str.toCharArray()) {
//      if(index == count) return c;
//        count++;
//    }
    char[] arr = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      if (i == index) {
        return arr[i];
      }
    }
    return '-';
  }

  public static String toLowerCase(String str) {
    char[] arr = str.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 'A' && arr[i] <= 'Z') {
        arr[i] += 32;
      }
    }
    return new String(arr);
  }

  public static String toUpperCase(String str) {
    char[] arr = str.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 'a' && arr[i] <= 'z') {
        arr[i] -= 32;
      }
    }
    return new String(arr);
  }

  public static boolean equals(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  public static int indexOf(String str, char c) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        return i;
      }
    }
    return -1;
  }

  public static int indexOf(String str, String s) { //S - второе слово, всем время начинаем проверят ьс 0

    boolean isHave = true;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == s.charAt(0)) { //Проверяем текущий индекс i с s[0]
        // System.out.println("Start index => " + start + " ; " + str.charAt(start));
        for (int j = 1; j < s.length(); j++) {
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

  public static String trim(String str) {
    int left = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        left++;
      } else {
        break;
      }
    }
    int right = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == ' ') right++;
      else break;
    }
    String newStr = "";
    for (int i = left; i < str.length() -right; i++) {
      newStr+= str.charAt(i);
    }
    return newStr;
    // return str.substring(left, str.length() - right);
  }

  public static boolean startsWith(String text, String search) {
    if(text.length() < search.length()) return false;
    for (int i = 0; i < search.length(); i++) {
      if(text.charAt(i) != search.charAt(i)) {
        return false;
      }
    }
    return true;
  }
  public static boolean equalsIgnoreCase(String str1, String str2) {
    if(str1.length()!= str2.length()) return false;

    for (int i = 0; i < str2.length(); i++) {
      if(str1.toLowerCase().charAt(i) != str2.toLowerCase().charAt(i)) return false;
    }
    return true;
  }

  public static boolean endWith(String text, String search) {
    if(text.length() < search.length()) return false;
    for (int i = text.length()-1, j = search.length()-1; i >=0 && j >= 0; i--, j--) {
      if(text.charAt(i) != search.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String name1 = "FARID";
    String name2 = "FarID";
  }

}
