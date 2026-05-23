class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        if(tokens.size()==0)
            return 0;
        stack<int> st;
        for(int i=0;i<tokens.size();i++)
        {
            string s = tokens[i];
            if(s=="+"||s=="-"||s=="*"||s=="/")
            {
                //TODO
                int a= st.top();
                st.pop();
                int b = st.top();
                st.pop();
                if(s=="+")
                    st.push(a+b);
                if(s=="-")
                    st.push(b-a);
                if(s=="*")
                    st.push(a*b);
                if(s=="/")
                    st.push(b/a);
            }
            else
            {
                st.push(stoi(s));
            }
        }
        return st.top();
    }
};
