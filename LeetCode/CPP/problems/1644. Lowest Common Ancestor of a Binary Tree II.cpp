#include "util/solution.h"

TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
    bool fp = false, fq = false;

    const auto res = [&](this auto&& self, TreeNode* node) -> TreeNode* {
        if (!node) return nullptr;

        const auto left = self(node->left), right = self(node->right);

        if (node == p) {
            fp = true;
            return node;
        }

        if (node == q) {
            fq = true;
            return node;
        }

        if (left && right) return node;

        return left ? left : right;
    }(root);

    return fp && fq ? res : nullptr;
}
