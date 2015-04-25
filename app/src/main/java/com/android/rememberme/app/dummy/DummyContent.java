package com.android.rememberme.app.dummy;

import com.android.rememberme.app.models.TaskModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<TaskModel> ITEMS = new ArrayList<TaskModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, TaskModel> ITEM_MAP = new HashMap<String, TaskModel>();

    static {
        // Add 3 sample items.
        addItem(new TaskModel("Tarea 1", "Descripcion", "01/01/2015", "01/01/2016", null));
        addItem(new TaskModel("Tarea 3", "Descripcion", "01/01/2015", "01/01/2016", null));
        addItem(new TaskModel("Tarea 4", "Descripcion", "01/01/2015", "01/01/2016", null));
        addItem(new TaskModel("Tarea 5", "Descripcion", "01/01/2015", "01/01/2016", null));
    }

    private static void addItem(TaskModel item) {
        item.setId(ITEMS.size());
        ITEMS.add(item);
        ITEM_MAP.put(item.getName(), item);
    }
}
