import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import richanganpai from '@/views/modules/richanganpai/list'
    import xiaofeijilu from '@/views/modules/xiaofeijilu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhongyaotixing from '@/views/modules/zhongyaotixing/list'
    import dictionaryRichanganpai from '@/views/modules/dictionaryRichanganpai/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXiaofeijilu from '@/views/modules/dictionaryXiaofeijilu/list'
    import dictionaryZhongyaotixing from '@/views/modules/dictionaryZhongyaotixing/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryRichanganpai',
        name: '安排类型',
        component: dictionaryRichanganpai
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXiaofeijilu',
        name: '消费类型',
        component: dictionaryXiaofeijilu
    }
    ,{
        path: '/dictionaryZhongyaotixing',
        name: '提醒类型',
        component: dictionaryZhongyaotixing
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/richanganpai',
        name: '日常安排',
        component: richanganpai
      }
    ,{
        path: '/xiaofeijilu',
        name: '消费记录',
        component: xiaofeijilu
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/zhongyaotixing',
        name: '重要提醒',
        component: zhongyaotixing
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
