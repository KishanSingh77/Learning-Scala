object listDemo extends App{  val nums = List.range(0, 10);  val nums1 = 1 to 10 by 2 toList;  val letters = ('a' to 'f').toList;  val letters2 = ('a' to 'f') by 2 toList;  println(nums);  println(nums1);  println(letters);  println(letters2);}