interface pair<K,V>{
   public K getKey();
   public V getValue();
   }
 class Multiple_TypeParameter<K,V> implements pair<K,V>{
        private K key;
        private V value;
       
   public Multiple_TypeParameter(){
      this.key = null;
      this.value= null;
      }
   public void add(K key,V value){
       this.key = key;
       this.value = value;
       }
    public K getKey(){
       return key;
       }
    public V getValue(){
        return value;
        }
   
  public static void main(String args[]){
       Multiple_TypeParameter<Integer,String> m = new Multiple_TypeParameter<>();
       m.add(1,"java");
       m.add(2,"python");
       System.out.println(m.getKey());
       System.out.println(m.getValue());
       }
       }
   
