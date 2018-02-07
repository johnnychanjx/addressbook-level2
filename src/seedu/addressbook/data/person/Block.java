package seedu.addressbook.data.person;


// Creates a Block to take in Block variable
public class Block {

 private static String block;

    public Block(String blk){

        this.block = blk;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}