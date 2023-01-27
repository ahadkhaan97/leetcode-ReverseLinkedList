fun main() {
    print(reverseList(prepareList(intArrayOf(1, 2, 3, 4, 5))))
}

fun prepareList(array: IntArray): ListNode {

    val head = ListNode(array[0])
    head.next = null
    for (i in 1 until array.size) {
        var temp = head
        while (temp.next != null) {
            temp = temp.next!!
        }
        temp.next = ListNode(array[i])
    }
    return head
}

fun reverseList(head: ListNode?): ListNode? {
    if (head == null)
        return null
    var tempList = ArrayList<Int>()
    var temp = head
    do {
        tempList.add(temp!!.`val`)
        temp = temp.next
    } while (temp != null)
    tempList = ArrayList(tempList.reversed())
    val newHead = ListNode(tempList[0])
    newHead.next = null
    for (i in 1 until tempList.size) {
        temp = newHead
        while (temp?.next != null) {
            temp = temp.next!!
        }
        temp?.next = ListNode(tempList[i])
    }
    return newHead
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}