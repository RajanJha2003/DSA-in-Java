//Approach-1 (Using bit magic of XOR)
//T.C : O(log2(num))
//S.C : O(1)
class Solution {
    public int findComplement(int num) {
        int numberOfBits = (int)(Math.log(num) / Math.log(2)) + 1;
        
        for (int i = 0; i < numberOfBits; i++) {
            num = num ^ (1 << i); // Take XOR to flip
        }
        return num;
    }
}


// Approach-2 (Using XOR mask)
// T.C : O(log2(num))
// S.C : O(1)
class Solution {
    public int findComplement(int num) {
        if (num == 0)
            return 1;

        // Calculate the number of bits in num
        int number_of_bits = (int)(Math.log(num) / Math.log(2)) + 1;
        
        // Create a mask with all bits set to 1 that are of the same length as num
        int mask = (1 << number_of_bits) - 1;

        // XOR num with mask to get the complement
        return num ^ mask;
    }
}

