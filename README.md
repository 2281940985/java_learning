## java基础学习
* == 比较的时两个变量的地址,equals比较的是两个变量的内容
* Java 程序都是从 main 方法开始执行，为了能运行这个程序，必须包含 main 方法并且创建一个实例对象。
* 局部变量（Local Variables）：局部变量是在方法、构造函数或块内部声明的变量，它们在声明的方法、构造函数或块执行结束后被销毁，局部变量在声明时需要初始化，否则会导致编译错误。
* 实例变量（Instance Variables）：实例变量是在类中声明，但在方法、构造函数或块之外，它们属于类的实例，每个类的实例都有自己的副本，如果不明确初始化，实例变量会被赋予默认值（数值类型为0，boolean类型为false，对象引用类型为null）。
* 静态变量或类变量（Class Variables）：类变量是在类中用 static 关键字声明的变量，它们属于类而不是实例，所有该类的实例共享同一个类变量的值，操作的是同一块内存，无论哪个对象修改了它，对其他对象来说，他已经变了。类变量在类加载时被初始化，而且只初始化一次。
* 参数变量（Parameters）：参数是方法或构造函数声明中的变量，用于接收调用该方法或构造函数时传递的值，参数变量的作用域只限于方法内部。
### static 修饰符
* 静态变量：static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。
* 静态方法：static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
### abstract 修饰符
* abstract 修饰符：抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。
抽象类可以包含抽象方法和非抽象方法。
* 抽象方法：抽象方法是一种没有任何实现的方法，该方法的具体实现由子类提供。抽象方法不能被声明成 final 和 static。任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。
### 实力类型
* 在判断一个实例引用的类型时，使用的是实际类型，而不是声明的类型。在下面的代码中。
* 子类的实例可以声明为父类型，但父类的实例不能声明为子类型
### Java 中 int 和 Integer 的区别
* int 是基本数据类型，int 变量存储的是数值。Integer 是引用类型，实际是一个对象，Integer 存储的是引用对象的地址。
  ```
  Integer i = new Integer(100);
  Integer j = new Integer(100);
  System.out.print(i == j); //false
  ```
* Integer 对象会占用更多的内存。Integer 是一个对象，需要存储对象的元数据。但是 int 是一个原始类型的数据，所以占用的空间更少。
* 非 new 生成的 Integer 变量与 new Integer() 生成的变量比较，结果为 false。
* 两个非 new 生成的 Integer 对象进行比较，如果两个变量的值在区间 [-128,127] 之间，比较结果为 true；否则，结果为 false。
*  Integer 变量(无论是否是 new 生成的)与 int 变量比较，只要两个变量的值是相等的，结果都为 true。
* 包装类 Integer 变量在与基本数据类型 int 变量比较时，Integer 会自动拆包装为 int，然后进行比较，实际上就是两个 int 变量进行比较，值相等，所以为 true。
### String类
* String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了
* Java 中 StringBuffer 和 String 是有一定的区别的，首先，String 是被 final 修饰的，他的长度是不可变的，就算调用 String 的 concat 方法，那也是把字符串拼接起来并重新创建一个对象，把拼接后的 String 的值赋给新创建的对象，而 StringBuffer 的长度是可变的，调用StringBuffer 的 append 方法，来改变 StringBuffer 的长度，并且，相比较于 StringBuffer，String 一旦发生长度变化，是非常耗费内存的！
### length() 方法，length 属性和 size() 方法的区别:
1. length() 方法是针对字符串来说的，要求一个字符串的长度就要用到它的length()方法；
2. length 属性是针对 Java 中的数组来说的，要求数组的长度可以用其 length 属性；
3. Java 中的 size() 方法是针对泛型集合说的, 如果想看这个泛型有多少个元素, 就调用此方法来查看!
```java
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String array[] = { "First", "Second", "Third" };
        String a = "HelloWorld";
        List<String> list = new ArrayList<String>();
        list.add(a);
        System.out.println("数组array的长度为" + array.length);
        System.out.println("字符串a的长度为" + a.length());
        System.out.println("list中元素个数为" + list.size());

    }
}
输出的值为:
        数组array的长度为3 
        字符串a的长度为10
        list中元素个数为1
```
### 方法的重载
* 重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载
* 被重载的方法可以改变返回类型；
* 被重载的方法可以改变访问修饰符；
* 
### super 关键字
* 调用父类的构造方法；
```java
super(); 或 super(参数列表);
```
* super 语句必须是子类构造方法的第一条语句。不能在子类中使用父类构造方法名来调用父类构造方法。 父类的构造方法不被子类继承。调用父类的构造方法的唯一途径是使用 super 关键字，如果子类中没显式调用，则编译器自动将 super(); 作为子类构造方法的第一条语句。
* 静态方法中不能使用 super 关键字,调用父类的方法语法：
```
super.方法名(参数列表);
```
* 如果是继承的方法，是没有必要使用 super 来调用，直接即可调用。但如果子类覆盖或重写了父类的方法，则只有使用 super 才能在子类中调用父类中的被重写的方法。
### final关键字
* 无论属性是基本类型还是引用类型，final 所起的作用都是变量里面存放的"值"不能变。
这个值，对于基本类型来说，变量里面放的就是实实在在的值，如 1，"abc" 等。
* 而引用类型变量里面放的是个地址，所以用 final 修饰引用类型变量指的是它里面的地址不能变，并不是说这个地址所指向的对象或数组的内容不可以变，这个一定要注意。
* 例如：类中有一个属性是 final Person p=new Person("name"); 那么你不能对 p 进行重新赋值，但是可以改变 p 里面属性的值 p.setName('newName');
* final 修饰属性，声明变量时可以不赋值，而且一旦赋值就不能被修改了。对 final 属性可以在三个地方赋值：声明时、初始化块中、构造方法中，总之一定要赋值。
* final修饰类中的方法：作用：可以被继承，但继承后不能被重写。
* final修饰类：作用：类不可以被继承。
### 重写(override)
* 参数列表与被重写方法的参数列表必须完全相同。返回类型与被重写方法的返回类型可以不相同，但是必须是父类返回值的派生类.
* 访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为 public，那么在子类中重写该方法就不能声明为 protected。
* 父类的成员方法只能被它的子类重写。声明为 final 的方法不能被重写。声明为 static 的方法不能被重写，但是能够被再次声明。
* 父类申明变量指向子类实例，该父类变量不能调用父类不存在的变量和方法，否则会编译错误
* 要想调用父类中被重写的方法，则必须使用关键字 super。
### 重写(overriding) 与 重载(overloading)总结
* 重载就是同样的一个方法能够根据输入数据的不同，做出不同的处理
* 重写就是当子类继承自父类的相同方法，输入数据一样，但要做出有别于父类的响应时，你就要覆盖父类方法


## leecode hot 100 刷题笔记
### 1.哈希
1. 两数之和:https://leetcode.cn/problems/two-sum/description/
    * 答案要求返回数组下标，重点在于根据值去查找下标，可以转换成HashMap存储键值对，利用HashMap的高效的查找、插入和删除操作
   可以降低时间复杂度为O(n * log n)
```java
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(numMap.containsKey(diff)){
                return new int[] {numMap.get(diff), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }
}
```
2. 字母异位词分组:https://leetcode.cn/problems/group-anagrams/
    * 先检查输入是否为空，遍历给定的字符串数组。
    * 对于每一个字符串，将其字符排序后得到一个新的字符串，用作哈希表的键。如果这个键不存在于哈希表中，则创建一个新的列表作为值,并将该未排序的字符串添加进列表中；如果键已存在，则将当前字符串添加到对应的列表中。
    * 将哈希表中的所有值（即所有字母异位词的分组）收集到一个新的列表中并返回。
    * 这种方法的时间复杂度主要取决于排序操作，对于每个字符串来说是O(nlogn)，其中n是字符串的最大长度，总的时间复杂度接近O(m*nlogn)，m为字符串数组的长度
```java
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            List<String> list = map.get(sortedStr);
            list.add(s);
        }
        System.out.println(map.values());
        List<List<String>> res = new ArrayList<>();
        for(List<String> s : map.values()){
            res.add(new ArrayList<>(s));
        }

        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
}

```
3. 最长连续序列
    * 将所有数组元素放入一个HashSet中，便于快速检查元素是否存在。
    * 遍历HashSet中的每个元素，对于每个元素，如果减一元素不存在于集合中，说明可以作为连续序列的起始点。
    * 通过不断检查并累加当前元素加一的值是否存在于集合中，来确定当前序列的长度。
```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int res = 1;
        //将所有元素存入hashSet中
        Set<Integer> numSet = new HashSet<Integer>();
        for(int num : nums){
            numSet.add(num);
        }
        for(int num : nums){
            int curlength = 1;
            if(numSet.contains(num - 1)){
               continue;
            }
//            if(!numSet.contains(num + 1)){
//                continue;
//            }
            while(numSet.contains(num + 1)){
                curlength++;
                num++;
            }
            res = Math.max(res, curlength);
        }
        return res;
    }
}
```
### 2.双指针
4. 移动0:https://leetcode.cn/problems/move-zeroes/description/
    * 先定义nonZeroIndex变量，用于记录下一个非零元素应该放置的位置。
    * 遍历数组nums，当遇到非零元素时，就将其与nums[nonZeroIndex]交换，之后nonZeroIndex向前推进。
    * 如果 i 和 nonZeroIndex 不相等（即当前元素不是原地移动），则将 nums[i] 设置为 0，因为该位置已经被移动的非零元素占据。
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;//存放非0元素
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                if(i != nonZeroIndex){ // 如果 i 和 nonZeroIndex 不相等（即当前元素不是原地移动），则将 nums[i] 设置为 0，因为该位置已经被移动的非零元素占据。
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }
}
```
5. 盛水最多的容器: https://leetcode.cn/problems/container-with-most-water/description/
    *  初始化左指针left为0，右指针right为数组最后一个元素的索引。
    * 在循环中，计算当前左右指针所能围成的容器的最大容积，并更新全局的最大容积maxWater。
    * 每次移动高度较小的那个指针，因为这样有机会找到更宽的底边，从而有可能形成更大的容器。循环直到左右指针相遇，最终返回maxWater作为结果。
    * 误区:千万不要将初始位置设为前两个元素，即快慢指针不适合这道题
```java
class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        while(left <  right){
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
            //移动较短的木板
            if(height[left] < height[right]){
                left++;
            }
            else right--;
        }
        return res;
    }
}
```
6. 三数之和:
    * 先对数组进行排序，使用一个外层循环遍历数组，内层使用双指针（一个从当前元素的下一个元素开始，另一个从数组末尾开始）来寻找和为0的三元组。
    * 为了避免重复，当找到一个三元组后，需要跳过所有和当前指针指向值相同的元素。
    * 四数之和也是同样的做法，两个for循环加双指针
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);//数组排序
        //for循环遍历，双指针（左右指针）寻找元素
        for(int i = 0; i < nums.length - 2; i++){
            //跳过重复元素
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //找到第一个为0的数组后继续寻找，但要跳过重复的元素
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;//跳过重复元素
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;//才是真正寻找新元素
                    right--;

                }
                else if(sum < 0){
                    left++;
                }
                else right--;
            }

        }
        return res;
    }
}
```
7. 接雨水: https://leetcode.cn/problems/trapping-rain-water/description/
    * 三个数组，左侧墙最大值，右侧墙最大值与height
    * 遍历到第i个位置时，该位置能接多少雨水与左侧墙最大值和右侧墙最大值的较小的减去height[i]得到
```java
import java.util.ArrayList;
import java.util.List;

class Solution {
   public int trap(int[] height) {
      int[] preMax = new int[height.length];//左侧墙最大值
      int[] surMax = new int[height.length];//右侧墙最大值
      preMax[0] = height[0];
      for (int i = 1; i < height.length; i++) {
         preMax[i] = Math.max(height[i], preMax[i-1]);
      }
      surMax[height.length - 1] = height[height.length - 1];
      for(int i = height.length - 2; i >= 0; i--) {
         surMax[i] = Math.max(surMax[i+1], height[i]);
      }
      int res = 0;
      for(int i = 0; i < height.length; i++) {
         res += Math.min(surMax[i], preMax[i]) - height[i];//公式
      }
      return res;
   }
   public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
   }
}

```
### 3.滑动窗口
8. 无重复字符的最长字串:https://leetcode.cn/problems/longest-substring-without-repeating-characters/
    * 先检查字符串是否为空或长度为0。然后，它使用一个HashMap来记录每个字符最后出现的位置。
    * 维护一个名为left的指针作为滑动窗口的左边界，以及一个maxLength变量来追踪最长子串的长度。
    * 遍历字符串时，如果当前字符已经存在于HashMap中并且其位置在当前窗口内，就将窗口的左边界移至该字符上次出现位置的下一个位置，以确保窗口内的字符不重复。
    * 更新当前字符在HashMap中的位置，并检查更新后的窗口大小是否比已知的最大长度还要大，如果是，则更新最大长度。
    * charMap.get(currentChar) >= left必须要加上，否则左边界会拓宽。
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        int res = 1;
        for(int i = 0; i < s.length(); ++i){
            char currentChar = s.charAt(i);
            if(charMap.containsKey(currentChar) && charMap.get(currentChar) >= left){
                left = charMap.get(currentChar) + 1;//确保滑动窗内的字符是不重复的
            }
            charMap.put(currentChar, i);
            res = Math.max(res, i - left + 1);

        }
        return res;
    }
}
```
9. 找到字符串中所有字母异位词:https://leetcode.cn/problems/find-all-anagrams-in-a-string/description/
    * 不能用Set去记录单词是否被比较，因为p的单词可能会重复
    * 利用map求解，将单词映射到数组中，下标代表单词，数值作为比较的依据，重复的单词就+1
    * 滑动窗即为要比较的字符串p的长度，利用Arrays.equals()去比较两个map数组是否相同，相同即找到异位词。
    * 利用for循环的i当中滑动窗的左边界，找到异位词就将i添加进结果数组中
```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}

```
### 4.字串
10. 和为k的子数组:https://leetcode.cn/problems/subarray-sum-equals-k/description/
    * 整体思路是利用前缀和去记录所有前缀和的次数，然后判断前缀和与k的差值是否在存储前缀和的哈希表中，若在，即代表两个前缀和元素之间的值即为k
    * 初始化一个哈希表 prefixSumCount，用来存储前缀和出现的次数，初始时前缀和为0的出现次数为1（表示空子数组的和）
    * 初始化一个变量 currentSum 来累计当前的前缀和。
    * 遍历数组 nums，对于每个元素，将其加到 currentSum 上，并查看 currentSum - k 是否在 prefixSumCount 中。如果在，说明从某个前缀和到当前位置的和为 k，因此将其对应的计数加到结果中。
    * 将 currentSum 在 prefixSumCount 中的计数加1，表示当前的前缀和出现了一次。
    * 遍历结束后，结果就是和为 k 的子数组的数量。
    ```java
    class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> preSum = new HashMap<Integer, Integer>();
        preSum.put(0,1);
        int curSum = 0;
        for(int num : nums){
            curSum += num;
            if(preSum.containsKey(curSum - k)){
                res += preSum.get(curSum - k); 
            }
            preSum.put(curSum, preSum.getOrDefault(curSum,0) + 1);
        }
        return res;
    }
    }
    ```
11. 滑动窗口最大值:https://leetcode.cn/problems/sliding-window-maximum/description/
    * 先初始化一个双端队列deque来存储数组中最大值的索引，以及一个结果数组result来存放每个窗口的最大值。
    * 算法分为两个阶段：维护队列头部存储的是滑动窗口的最大值，维护队列的头部始终在滑动窗口内。
    * 随着for循环的迭代，每次遍历新的元素相当于滑动窗口右移。将新的元素添加进单调队列中。


```java
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] res =new int[n - k + 1];
        int index = 0;
        for(int i = 0; i < n; ++i){
            //维护队列头部为最大值
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            //维护deque的存储内容始终在滑动窗口内
            while(!deque.isEmpty() && deque.peek() < i - k + 1){
                deque.poll();
            }
            deque.offer(i);
            if(i >= k - 1){
                res[index] = nums[deque.peek()];
                index++;
            }
        }
        return res;
    }
}
```
