$.fn.serializeJson = function(){
    var obj = {};
    var array = this.serializeArray();
    $.each(array, function() {
        if (obj[this.name]) {
            if (!obj[this.name].push) {
                obj[this.name] = [obj[this.name]];
            }
            obj[this.name].push(this.value || '');
        } else {
            obj[this.name] = this.value || '';
        }
    });
    return JSON.stringify(obj);
};