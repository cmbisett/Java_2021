class Node{
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class SLL{
    constructor(){
        this.head = null;
    }

    isEmpty(){
        if (this.head) {
            return false;
        } else {
            return true;
        }
    }
    
    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // add given node to the head, if it exists.
    // is the list empty?
    // does the list already have nodes?
    addToFront(node) {
        if(!this.head) {
            return this.head = node; 
        }
    }

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) {
        if(!this.head) {
            return this.addToFront(new Node(data));
        } else {
            return this.head.next = new Node(data) ;
        }
    }
}

// instantiate the SLL first!
var myList = new SLL();

console.log(myList.addToFront(new Node(2)));
console.log(myList.addDataToFront(new Node(5)));

console.log(myList);