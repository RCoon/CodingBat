public String frontTimes(String str, int n) {
  String front = "";
  String result = "";
  
  if (str.length() < 3) {
    front += str;
  } else {
    front += (str.substring(0, 3));
  }
  
  for (int i = 0; i < n; i++) {
    result += front;
  }
  return result;
}
