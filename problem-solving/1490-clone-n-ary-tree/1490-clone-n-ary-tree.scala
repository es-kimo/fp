/**
 * Definition for a Node.
 * class Node(var _value: Int) {
 *   var value: Int = _value
 *   var children: List[Node] = List()
 * }
 */

object Solution {
    def cloneTree(root: Node): Node = {
        Option(root) match {
            case None => null
            case Some(node) =>
                new Node(node.value) {
                    children = node.children.map(cloneTree)
                }
        }
    }
}