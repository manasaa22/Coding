public class Nmeetings {
    
}
/*class Solution
{
    static bool cmp(pair<int,int> p1,pair<int,int> p2){
        if(p1.second==p2.second)
                return p1.first>p2.first;
        return p1.second<p2.second;
    }
    public:
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    int maxMeetings(int start[], int end[], int n)
    {
        // Your code here
        int i;
        vector<pair<int,int>>vec;
        
        int count=0;
        
        int endt;
        for(i=0;i<n;i++)
        {
            
            vec.push_back({start[i],end[i]});
        }
        
        sort(vec.begin(),vec.end(),cmp);
        
        endt=vec[0].second;
        count+=1;
        for(i=1;i<n;i++)
        {
            if(endt<vec[i].first)
            {
                endt=vec[i].second;
                count+=1;
            }
        }
        
        
        return count;
    }
}; */