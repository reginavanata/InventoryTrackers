package inventory;

import java.util.*;
import java.io.*;
import java.util.*;
import java.io.*;

/**
 * This class represents an inventory of the 26 letters in the English alphabet.
 * A LetterInventory object keeps track of how many a’s, how many b’s, etc.
 * are contained in a given string.
 * For example:
 * the letter inventory for the string “Washington State” corresponds to [aaeghinnosstttw].
 * The case of the letter is ignored, so ‘s’ and ‘S’ are exactly the same.
 */
public class LetterInventory implements Inventory {
   // instance field
   private int[] letters; // letters is null here



   // default constructor - need to provide this constructor
   // so memory is constructed for array (so it is no longer null)
   public LetterInventory() {
      //TODO fix the style issue below
      letters = new int[26];
   }


   /**
    * Returns a String representation of the inventory with the letters all in lowercase
    * surrounded by square brackets in alphabetical order. The number of occurrences of
    * each letter matches its count in the inventory.
    * For example, an inventory of 4 a’s, 1 b, 1 k and 1 m would be represented as “[aaaabkm]”.
    * @return a bracketed string representation of the letters contained in the inventory
    */
   public String toString() {
      // If you are concatenating many strings together, StringBuilder class
      // is often more efficient(faster)
      StringBuilder toReturn = new StringBuilder("[");

      // for every count in the letters inventory
      for(int i = 0; i < letters.length; i++) {
         // add each character to the string count times
         for(int count = 0; count < letters[i]; count++) {
            // ascii math performed here
            // Example:
            // 'a' + 0 = 'a'
            // 'a' + 1 = 'b'
            // 'a' + 2 = 'c'
            // 'a' + 25 = 'z'
            toReturn.append((char)('a' + i));
         }
      }
      return toReturn.append("]").toString();
   }

   /**
    * increments the count of the character c in the inventory
    *
    * @param c character to track in inventory
    */
   @Override
   public void add(char c) {

   }

   /**
    * decrements the count of the character c in the inventory
    *
    * @param c character to track in inventory
    */
   @Override
   public void subtract(char c) {

   }

   /**
    * returns a count of the letter in the inventory, zero otherwise
    *
    * @param c character in inventory
    * @return a count of the character in the inventory
    */
   @Override
   public int get(char c) {
      return 0;
   }

   /**
    * updates the count of the character c in the inventory (if count is zero or greater)
    *
    * @param c     character to update in inventory, throws IllegalArgumentException if character not in inventory
    * @param count number to update count with, throws IllegalArgumentException if negative
    */
   @Override
   public void set(char c, int count) {

   }

   /**
    * returns true if character is contained in the inventory
    *
    * @param c character
    * @return true if character in inventory, false otherwise
    */
   @Override
   public boolean contains(char c) {
      return false;
   }

   /**
    * returns the sum of all counts in the inventory
    *
    * @return the total count
    */
   @Override
   public int size() {
      return 0;
   }

   /**
    * Returns true if this inventory is empty (all counts are 0)
    *
    * @return true if all counts are 0, false otherwise
    */
   @Override
   public boolean isEmpty() {
      return false;
   }
}

