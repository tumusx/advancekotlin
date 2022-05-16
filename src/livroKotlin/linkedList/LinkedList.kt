package livroKotlin.linkedList

class LinkedList<T> {
    private var size = 0
    private var headNode: Node<T>? = null
    private var tailNode: Node<T>? = null

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty List"
        } else {
            return headNode.toString()
        }
    }

    fun pushValue(value: T): LinkedList<T> {
        headNode = Node(value = value, next = headNode)
        if (tailNode == null) {
            tailNode = headNode
        }
        size++
        return this
    }

    fun append(value: T): LinkedList<T> {
        if (isEmpty()) {
            pushValue(value)
            return this;
        }
        tailNode?.next = Node(value = value)
        tailNode = tailNode?.next
        size++
        return this
    }

    fun nodeAt(indext: Int): Node<T>? {
        var currentNode = headNode
        var currentIndex = 0

        while (currentNode != null && currentIndex < indext) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T>? {
        if (tailNode == afterNode) {
            append(value)
            tailNode.let {
                return it
            }
        }

        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }
}

fun main() {
    val list = LinkedList<Int>()
    list.pushValue(3)
    list.pushValue(2)
    list.pushValue(1)

    var middleNode = list.nodeAt(1)
    for (i in 1..3) {
        middleNode = middleNode?.let { list.insert(-1 * i, it) }
    }
    println(list)
}