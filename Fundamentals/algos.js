class SLQueue {
    constructor() {
      this.head = null;
      this.tail = null;
      this.size = 0;
    }
  
    enqueue(value){
        let newNode = new SLNode(value);
        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            this.tail = newNode; 
        }
        this.size++;
    }
    dequeue(){
        if (this.isEmpty()) {
            return null;
        }
        let temp = this.head;
        if (this.head == this.tail) {
            this.tail = null;
        }
        this.head = this.head.next;
        this.size --;
        return temp.value;
        
    }
    isEmpty(){
        return this.head == null;

    }
    getSize(){
        return this.size;
      
    }
    front(){
        if (this.isEmpty()) {
            return null
        }
        return this.head.value
      
    }
  
    printPretty() {
        if (this.isEmpty()) {
            return null
    }
        let runner = this.head;
        let values = "";
        while (runner ) {
            values += runner.value + " ";
            runner = runner.next; 
        }
        console.log(values);
        return values;
}
}

class SLNode {
    constructor(value) {
        this.value = value
        this.next = null
    }
}
let q = new SLQueue;
q.enqueue(1);
printPretty