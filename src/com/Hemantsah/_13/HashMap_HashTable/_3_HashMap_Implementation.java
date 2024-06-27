package com.Hemantsah._13.HashMap_HashTable;

public class _3_HashMap_Implementation {
    private Entity[] entities;
    public _3_HashMap_Implementation(){
        entities = new Entity[100];
    }
    private class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key=key;
            this.value=value;
        }
    }
    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }
    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }

    public static void main(String[] args) {
        _3_HashMap_Implementation map = new _3_HashMap_Implementation();
        map.put("12","hemant");
        map.put("32","fantus");
        System.out.println(map.get("12"));
        map.remove("12");
        System.out.println(map.get("12"));
    }
}
