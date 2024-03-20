package Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemManagerTest {
    /*Test Add*/
    @Test
    void testAddFirst() {//Everything is valid
        var itemManager = new ItemManager();
        Item item = new Item(6, "Nong Hoang Vu");
        itemManager.addItem(item);
        assertEquals(1, itemManager.getItems().size());
    }

    @Test
    void testAddSecond() {//name too long
        var itemManager = new ItemManager();
        Item item = new Item(6, "Nong Hoang Vu Nong Hoang Vu Nong Hoang Vu Nong Hoang Vu ");
        itemManager.addItem(item);
        assertEquals(0, itemManager.getItems().size());
    }

    @Test
    void testAddThird() {//id: -1
        var itemManager = new ItemManager();
        Item item = new Item(-1, "Nong Hoang Vu");
        itemManager.addItem(item);
        assertEquals(0, itemManager.getItems().size());
    }

    /*Test Update*/
    @Test
    public void testUpdateFirst() {//Everything is valid
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(new Item(6, "Nong Hoang Vu"));//index 0
        itemManager.updateItem(6, "Nguyen Van A");
        assertEquals("Nguyen Van A", itemManager.getItems().get(0).getName());
    }

    @Test
    public void testUpdateSecond() {//id not found
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(new Item(6, "Nong Hoang Vu"));//index 0
        itemManager.updateItem(0, "Nguyen Van A");
        assertNotEquals("Nguyen Van A", itemManager.getItems().get(0).getName());
    }

    @Test
    void testUpdateThird() {//name too long
        var itemManager = new ItemManager();
        itemManager.addItem(new Item(6, "Nong Hoang Vu"));
        itemManager.updateItem(6, "Nong Hoang Vu Nong Hoang Vu Nong Hoang Vu Nong Hoang Vu ");
        assertEquals("Nong Hoang Vu", itemManager.getItems().get(0).getName());
    }

    /*Test Delete*/
    @Test
    public void testDeleteFirst() {//remove success
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(new Item(6, "Nguyen Van A"));
        itemManager.addItem(new Item(7, "Nguyen Van B"));
        itemManager.addItem(new Item(8, "Nguyen Van C"));
        itemManager.deleteItem(7);
        assertEquals(2, itemManager.getItems().size());
    }

    @Test
    public void testDeleteSecond() {//id not found
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(new Item(6, "Nguyen Van A"));
        itemManager.addItem(new Item(7, "Nguyen Van B"));
        itemManager.addItem(new Item(8, "Nguyen Van C"));
        itemManager.deleteItem(9);
        assertEquals(3, itemManager.getItems().size());
    }

    @Test
    public void testDeleteThird() {//id is not a number
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(new Item(6, "Nguyen Van A"));
        itemManager.addItem(new Item(7, "Nguyen Van B"));
        itemManager.addItem(new Item(8, "Nguyen Van C"));
        assertThrows(NumberFormatException.class, () -> itemManager.deleteItem(Integer.parseInt("Six")));
    }
}