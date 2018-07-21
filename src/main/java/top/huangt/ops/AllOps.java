package top.huangt.ops;

/**
 * @author ht
 */
public class AllOps {
    public static void main(String[] args){

    }
    static void f(boolean b) {}
    static void boolTest(boolean x, boolean y) {
        //Arithmetic operators 算术运算符
//        x = x * y;
//        x = x / y;
//        x = x % y;
//        x = x + y;
//        x = x - y;
//        x++;
//        x--;
//        x = +y;
//        x = -y;
        //Relational and logical 关系逻辑
//        f(x > y);
//        f(x >= y);
//        f(x < y);
//        f(x <= y);
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        //Bitwise operators 位操作符
//        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
//        x = x << 1;
//        x = x >> 1;
//        x = x >>> 1;
        //Compound assignment 复合赋值
//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;
//        x <<= y;
//        x >>= y;
//        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        //Casting 强转
//        char c = (char)c;
//        byte b = (byte)x;
//        short s = (short)x;
//        int i = (int)x;
//        long l = (long)x;
//        float f = (float)x;
//        double d = (double)x;
    }
    static void charTest(char x, char y) {
        //Arithmetic operators 算术运算符
        x = (char)(x * y);
        x = (char)(x / y);
        x = (char)(x % y);
        x = (char)(x + y);
        x = (char)(x - y);
        x++;
        x--;
        x = (char)+y;
        x = (char)-y;
        //Relational and logical 关系逻辑
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
//        f(!x);
//        f(x && y);
//        f(x || y);
        //Bitwise operators 位操作符
        x = (char)~y;
        x = (char)(x & y);
        x = (char)(x | y);
        x = (char)(x ^ y);
        y = (char)(x << 1);
        y = (char)(x >> 1);
        y = (char)(x >>> 1);
        //Compound assignment
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        //Casting
//        boolean bl = (boolean)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
}
