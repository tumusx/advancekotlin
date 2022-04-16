package POO

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.*


class A {
    var `is`: InputStream? = null
    var out: PrintWriter? = null
    var INPUT = ""
    fun solve() {
        val numbers = "0123456789"
        val lower_case = "abcdefghijklmnopqrstuvwxyz"
        val upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val special_characters = "[email protected]#$%^&*()-+"
        val n = ni()
        val s = ns(n)
        var need = 0
        var x = 0
        for (c in s) {
            if (numbers.indexOf(c) >= 0) x = x or 1
            if (lower_case.indexOf(c) >= 0) x = x or 2
            if (upper_case.indexOf(c) >= 0) x = x or 4
            if (special_characters.indexOf(c) >= 0) x = x or 8
        }
        need = 4 - Integer.bitCount(x)
        out!!.println(Math.max(6 - n, need))
    }

    @Throws(Exception::class)
    fun run() {
        `is` = if (INPUT.isEmpty()) System.`in` else ByteArrayInputStream(INPUT.toByteArray())
        out = PrintWriter(System.out)
        val s = System.currentTimeMillis()
        solve()
        out!!.flush()
        if (!INPUT.isEmpty()) tr(s.toString() + System.currentTimeMillis() + "ms")
    }

    private val inbuf = ByteArray(1024)
    var lenbuf = 0
    var ptrbuf = 0
    private fun readByte(): Int {
        if (lenbuf == -1) throw InputMismatchException()
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0
            lenbuf = try {
                `is`!!.read(inbuf)
            } catch (e: IOException) {
                throw InputMismatchException()
            }
            if (lenbuf <= 0) return -1
        }
        return inbuf[ptrbuf++].toInt()
    }

    private fun isSpaceChar(c: Int): Boolean {
        return !(c >= 33 && c <= 126)
    }

    private fun skip(): Int {
        var b: Int
        while (readByte().also { b = it } != -1 && isSpaceChar(b));
        return b
    }

    private fun nd(): Double {
        return ns().toDouble()
    }

    private fun nc(): Char {
        return skip().toChar()
    }

    private fun ns(): String {
        var b = skip()
        val sb = StringBuilder()
        while (!isSpaceChar(b)) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b)
            b = readByte()
        }
        return sb.toString()
    }

    private fun ns(n: Int): CharArray {
        val buf = CharArray(n)
        var b = skip()
        var p = 0
        while (p < n && !isSpaceChar(b)) {
            buf[p++] = b.toChar()
            b = readByte()
        }
        return if (n == p) buf else Arrays.copyOf(buf, p)
    }

    private fun nm(n: Int, m: Int): Array<CharArray?> {
        val map = arrayOfNulls<CharArray>(n)
        for (i in 0 until n) map[i] = ns(m)
        return map
    }

    private fun na(n: Int): IntArray {
        val a = IntArray(n)
        for (i in 0 until n) a[i] = ni()
        return a
    }

    private fun ni(): Int {
        var num = 0
        var b: Int
        var minus = false
        while (readByte().also { b = it } != -1 && !(b >= '0'.toInt() && b <= '9'.toInt() || b == '-'.toInt()));
        if (b == '-'.toInt()) {
            minus = true
            b = readByte()
        }
        while (true) {
            num = if (b >= '0'.toInt() && b <= '9'.toInt()) {
                num * 10 + (b - '0'.toInt())
            } else {
                return if (minus) -num else num
            }
            b = readByte()
        }
    }

    private fun nl(): Long {
        var num: Long = 0
        var b: Int
        var minus = false
        while (readByte().also { b = it } != -1 && !(b >= '0'.toInt() && b <= '9'.toInt() || b == '-'.toInt()));
        if (b == '-'.toInt()) {
            minus = true
            b = readByte()
        }
        while (true) {
            num = if (b >= '0'.toInt() && b <= '9'.toInt()) {
                num * 10 + (b - '0'.toInt())
            } else {
                return if (minus) -num else num
            }
            b = readByte()
        }
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            A().run()
        }

        private fun tr(vararg o: Any) {
            println(Arrays.deepToString(o))
        }
    }
}
