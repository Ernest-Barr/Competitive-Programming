// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
public:
    Node* findRoot(vector<Node*> tree) {
        unordered_set<int> set;

        for (const auto &u : tree) {
            for (const auto &v : u->children) {
                set.insert(v->val);
            }
        }

        for (const auto &u : tree) {
            if (!set.contains(u->val)) return u;
        }

        return nullptr;
    }
};