package com.Hemantsah._13.HashMap_HashTable;

import java.util.ArrayList;
import java.util.LinkedList;

public class _4_HashMapImplementationFinal<K,V> {//generics   //This _4_HashMapImplementationFinal is Data Structure
    ArrayList<LinkedList<Entity>> list;

    private int size=0;

    private float lf = 0.5f;  //lf(Load factor): inserted items/total size of array MEANS if we have already inserted 50 item and if we add 51st element then it will double the size of HashMap.

    public _4_HashMapImplementationFinal(){
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }
    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash); //get the LL of ArrayList index(hash)

        //if that key is already present then simply replace its value with new value
        for(Entity entity: entities){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        //for key new
        entities.add(new Entity(key, value));
        size++;

        //check for load factor
        if((float)size/list.size()>lf){
            reHash();
        }
    }
    private void reHash(){
        System.out.println("We are now rehashing"); //since our list is half full so we copy the entire list to new list of size double.

        ArrayList<LinkedList<Entity>> old = list; //putting all the data of list into oldList
        list = new ArrayList<>(); //making list empty
        size=0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        } //doubling the size of list

        //adding all the data from old list to this new list of size double
        for(LinkedList<Entity> entities:old){
            for(Entity entity: entities){
                put(entity.key, entity.value);
            }
        }
    }
    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity:entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }
    public void removE(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for(Entity entity:entities){
            if(entity.key.equals(key)){
                target=entity;
                break;
            }
        }
        entities.remove(target);
        size--;
    }
    public boolean containsKey(K key){
        return get(key)!=null;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{ ");
        for(LinkedList<Entity>entities:list){
            for(Entity entity:entities){
                builder.append(entity.key);
                builder.append("=");
                builder.append(entity.value);
                builder.append(", ");
            }
        }
        builder.append("}");
        return builder.toString();
    }

    class Entity{
        K key;
        V value;

        public Entity(K key, V value){
            this.key=key;
            this.value=value;
        }
    }

}
