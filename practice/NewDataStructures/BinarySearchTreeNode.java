package NewDataStructures;

public class BinarySearchTreeNode extends BinaryTreeNode {
  
  private int value;
  
  public BinarySearchTreeNode(int value) {
    this.value = value;
  }

  @Override
  public int value() {
    return this.value;
  }

  @Override
  public void value(int value) {
    this.value = value;
  }
  
  public boolean insert(int value) {
    return insert(this, value);
  }
  
  public boolean insert(BinaryTreeNode node, int value) {
    if (node.value() == value)
      return false;
    else if (value > node.value()) {
      if (node.right() == null) {
        node.right(new BinarySearchTreeNode(value));
        return true;
      } else {
        return insert(node.right(), value);
      }
    } else {
      if (node.left() == null) {
        node.left(new BinarySearchTreeNode(value));
        return true;
      } else {
        return insert(node.left(), value);
      }
    }
  }
  
}
