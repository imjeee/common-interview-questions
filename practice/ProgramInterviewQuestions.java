import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.lang.StringBuffer;

class ProgramInterviewQuestions {
  public static void main(String[] args){
    System.out.println("programming interview questions practice!\n");

    groupStrings();
    isSubString();
    maxSubArray();
    allUniqueCharacters();
    anagram();
    switchem();
    findBitPosition();
    reverseString();
    mergeSortedIntArrays();
    //misc();
    playWithLinkedList();
    playWithBinarySearchTree();
    playWithQueue();
    findHowMuchWaterCanAccumulate();
    printPascalPyramid();
    printWhatYouSeeInNumbers();
    findLongestAnagramInString();
    searchNumberInSortedButRotatedArray();
    encodeStringByCharAndNumber();
    findMinimumWindowInStringOneWhichContainsAllCharsInStringTwo();
    givenNReturnAllNumbersInRange();
    traceBackRouteUsingPlaneTickets();
  }
  
  private static void traceBackRouteUsingPlaneTickets() {
    String[] one = {"beijing", "tokyo"};
    String[] two = {"paris", "berlin"};
    String[] three = {"london", "beijing"};
    String[] four = {"istanbul", "dubai"};
    String[] five = {"tokyo", "istanbul"};
    String[] six = {"dubai", "paris"};
    String[] seven = {"berlin", "washington"};
    String[] eight = {"washington", "austin"};
    String[][] tickets = {one, two, three, four, five, six, seven, eight};
    String route = Algorithms.traceBackRouteUsingPlaneTickets(tickets);
    System.out.println("given a bunch of tickets, trace back the route: " + route);
  }
  
  private static void givenNReturnAllNumbersInRange() {
    int n = 33;
    int[] arr = {3,6,8};
    String output = Algorithms.givenNReturnAllNumbersInRange(n, arr);
    System.out.println("print all numbers in range: " + n + ", " + Algorithms.printIntArray(arr) + ": " + output);
  }
  
  private static void findMinimumWindowInStringOneWhichContainsAllCharsInStringTwo() {
    String one = "ADOBECODEBANC";
    String two = "ABC";
    System.out.print("given string: " + one + ", and target string: " + two + ", the minimum window: ");
    System.out.println(Algorithms.findMinimumWindowInStringOneWhichContainsAllCharsInStringTwo(one, two));
  }

  private static void encodeStringByCharAndNumber() {
    String s = "aabbaadddc";
    System.out.println("encode string: " + s + " to " + Algorithms.encodeString(s));
  }
  
  private static void searchNumberInSortedButRotatedArray() {
    int[] rotatedArray = {8,9,1,2,3,4,5,6,7};
    int target = 10;
    System.out.println("find " + target + " in rotated array: " + Algorithms.convertArrayToString(rotatedArray));
    System.out.println("target position: " + Algorithms.searchNumberPosInSortedButRotatedArray(rotatedArray, target));
  }
  
  private static void findLongestAnagramInString() {
    String s = "banana";
    System.out.print("find longest anagram in string: " + s + " is ");
    System.out.println(findLongestAnagramInString(s));
  }
  
  private static String findLongestAnagramInString(String s) {
    String preprocessedString = Algorithms.insertStarsInString(s);
    String longestAnagramWithStars = Algorithms.findLongestAnagramInStringBruteForceWay(preprocessedString);
    String longestAnagram = Algorithms.stripStarsFromString(longestAnagramWithStars);
    return longestAnagram;
  }
  
  private static void printWhatYouSeeInNumbers() {
    System.out.println("print what you see:");
    System.out.println(Algorithms.printWhatYouSeeGivenNumOfLevels(10));
  }
  
  private static void printPascalPyramid() {
    System.out.println("print pascal pyramid:");
    System.out.println(Algorithms.getPascalPyramid(10));
  }
  
  private static void groupStrings() {
    String[] source = {"a", "ab", "fadeer", "asdwer", "awerd", "acfgdsfgser"};
    String beginning = "ac";
    String end = "afd";
    List<String> result = Algorithms.getStringsInBetweenTwoWordsLikeInDictionary(source, beginning, end);
    for (String s : result)
      System.out.print(s + ", ");
  }
  
  private static void findHowMuchWaterCanAccumulate() {
    int[] pond = {4,3,5,2,1,4,5,7,3,5,8};
    int[] pond2 = {4,2,3,1,2,0,1,2};
    System.out.println("water accumulated total is: " + Algorithms.findHowMuchWaterCanAccumulate(pond2));
  }
  
  private static void reverseString() {
    String s = "hello how are you doing?";
    System.out.println("reverse \"" + s + "\": \"" + Algorithms.reverseWords(s) + "\"");
    System.out.println("reverse \"" + s + "\": \"" + Algorithms.reverseWordsByLetter(s) + "\"");
  }

  private static void findBitPosition() {
    int num = 33;
    System.out.println("first bit position of " + num + " is " + Algorithms.findBitPosition(num));
  }

  private static void misc() {
    int[] i = { Integer.MAX_VALUE };
    System.out.println(i[0]);
    i[0]++;
    System.out.println(i[0]);
  }

  private static void switchem() {
    int[] input = {-1, 5, -2, 3, 9, -10, -5, 3, -10, 9, 8, 7, -30, -100};
    int[] output = Algorithms.switchem(input);
    
    for (int i : output) {
      System.out.print(i+" ");
    }
    System.out.println();
  }

  private static void anagram() {
    String one = "banana";
    String two = "anaban";
    System.out.println(one + " and " + two + " are anagram of eachother: " + Algorithms.areAnagram(one, two));
  }

  private static void allUniqueCharacters() {
    String source = "what is up my friend";
    System.out.println(source + " - contain all unique characters: " + Algorithms.containsAllUniqueChars(source));
  }

  private static void maxSubArray() {
    int[] array = {10, 1, -100,20,3,-300, -50, 100, 4, -20, 30};
    System.out.println("max array length is " + Algorithms.maxSubArray(array));
  }

  private static void isSubString() {
    String source = "why hello there";
    String target = "hello2";
    
    System.out.println(target + " is substring of " + source + ": " + Algorithms.isSubString(source, target));
  }

  private static void playWithLinkedList() {
    LinkedListNode<Integer> node = new LinkedListNode<Integer>(10);
    LinkedListNode<Integer> node2 = new LinkedListNode<Integer>(20);
    node.next(node2);    
    Algorithms.printLinkedList(node);
  
    LinkedListNode<Integer> node3 = new LinkedListNode<Integer>(25);    
    LinkedListNode<Integer> head = Algorithms.insertToEnd(node, node3);
    Algorithms.printLinkedList(head);
    
    LinkedListNode<Integer> node4 = new LinkedListNode<Integer>(1);
    head = Algorithms.insertToBeginning(node, node4);
    Algorithms.printLinkedList(head);
    
    LinkedListNode<Integer> one = new LinkedListNode<Integer>(1);
    LinkedListNode<Integer> two = new LinkedListNode<Integer>(10);
    one.insert(one, 2);
    one.insert(one, 3);
    one.insert(one, 4);
    one.insert(one, 5);
    one.insert(one, 6);
    one.delete(one, 2);
    one.insert(one, 2);
    one.insert(one, 13);
    Algorithms.printLinkedList(one);
    System.out.println("middle node is: " + Algorithms.returnMiddleNode(one).value());
    
    
    Algorithms.insertToEnd(one, two);
    Algorithms.insertToEnd(two, one);
    /* this linked list now has a cycle, so don't print it like a singly linked list with no cycle */
    System.out.println("does this linked list have cycle: " + Algorithms.ifLinkedListHasCycle(one));
  }

  private static void mergeSortedIntArrays() {
    int[] a = {1,4,6,8,9};
    int[] b = {4,7,8, 10,12};
    int[] result = Algorithms.mergeSortedIntArrays(a, b);
    System.out.print("Merged int array: ");
    for (int i = 0; i < result.length; i++)
      System.out.print(result[i] + ", ");
    System.out.println();
  }

  private static void playWithQueue() {
    MyQueue<Integer> myQueue = new MyQueue<Integer>();
    for (int i = 0; i < 10; i++) {
      myQueue.enqueue(i);
    }
  
    System.out.print("myQueue: ");
    while (myQueue.peek() != null) {
      System.out.print(myQueue.dequeue() + ", ");
    }
    System.out.println(myQueue.dequeue());
  }

  private static void playWithBinarySearchTree() {
    BinaryTreeNode node = new BinarySearchTreeNode(25);
    System.out.println("insert binary tree node 20 successfull: " + node.insert(20));
    System.out.println("insert binary tree node 25 successfull: " + node.insert(26));
    System.out.println("insert binary tree node 30 successfull: " + node.insert(30));
    System.out.println("insert binary tree node -30 successfull: " + node.insert(-30));
    System.out.println("insert binary tree node 21 successfull: " + node.insert(21));
    System.out.println("insert binary tree node 2 successfull: " + node.insert(2));

    Algorithms.printBinaryTreeByLayer(node);
    Algorithms.printTreeInOrderUsingStack(node);
  }

}
