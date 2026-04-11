fun uniformArray(nums1: IntArray): Boolean {
    /*

    For any given odd integer x, we can represent it as 2k + 1 for some integer k
    For any given even integer y, we can represent it as 2k for some integer k

    Observations: Let k and m be integers

    odd + even = odd
    - 2k + (2m + 1) = 2(k + m) + 1
    even + even = even
    - 2k + 2m = 2(k + m)
    odd + odd = even
    - (2k + 1) + (2m + 1) = 2k + 2m + 2 = 2(k + m + 1)

    Case 1: We want nums2 to be even:
    - As long as we have more than 1 odd integer we can make everything even
    Case 2: We want nums2 to be odd:
    - Any even value + an odd value will be odd
    - Valid as long as we have at least one odd number


    Conclusion:
    - In both of the above cases we can force an array to be of the same parity as long as
    there is a value in the array.
    - For even there needs to be at least two odd numbers
    - For odd, there just needs to be one odd number

    - True for all cases since we can take the lower bound of at least one odd number to force
    same parity.
     */

    return true
}
