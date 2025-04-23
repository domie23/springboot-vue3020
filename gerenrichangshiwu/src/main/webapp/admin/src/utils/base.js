const base = {
    get() {
        return {
            url : "http://localhost:8080/gerenrichangshiwu/",
            name: "gerenrichangshiwu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gerenrichangshiwu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人日常事务管理系统"
        } 
    }
}
export default base
