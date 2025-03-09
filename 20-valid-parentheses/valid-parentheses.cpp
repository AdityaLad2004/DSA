class Solution {
public:
    bool isValid(string s) {
        stack<char> s1;

        for(char ch:s){
            if(ch=='(' || ch=='{' || ch=='['){
                s1.push(ch);
            }

            else{
                if(s1.empty()){
                    return false;
                }

                char top=s1.top();

                if((ch==')' && top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[')){
                    s1.pop();
                }

                else{
                    return false;
                }
            }

            
        }

        return s1.empty();

        

        return false;
    }
};