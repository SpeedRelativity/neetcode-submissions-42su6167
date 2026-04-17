class TimeMap {

    
    HashMap<String, TreeMap<Integer, String>> timeMap;
    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {

        if(!timeMap.containsKey(key)){
            timeMap.put(key, new TreeMap<>());
        }
        timeMap.get(key).put(timestamp, value);
        
    }
    
    public String get(String key, int timestamp) {
        
        if(!timeMap.containsKey(key)){
            return "";
        }
        
        if(timeMap.get(key).containsKey(timestamp)){
            return timeMap.get(key).get(timestamp);
        }
        else{
            Map.Entry<Integer,String> entry = timeMap.get(key).floorEntry(timestamp);
            if (entry == null){
                return "";
            }
            else{
                return entry.getValue();
            }
        }
        
    }
}
