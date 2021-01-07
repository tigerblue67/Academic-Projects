module.exports = {
    subtract: function(x,y) {
        ans = x-y;
        if (ans < 0){
            ans = 0;
        }

        return ans;
    }
}
