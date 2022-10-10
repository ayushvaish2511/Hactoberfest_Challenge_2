class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i<paths.size(); i++)
        {
            String A = paths.get(i).get(0);
            String B = paths.get(i).get(1);
            map.put(A, B);
        }
        String city = paths.get(0).get(0);
        while(true)
        {
            if(map.containsKey(city))
            {
                city = map.get(city);
            }
            else 
            {
                break;
            }
        }
        return city;
    }
}