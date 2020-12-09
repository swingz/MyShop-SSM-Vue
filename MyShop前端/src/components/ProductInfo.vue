<template>
  <el-container>
    <el-header>
      <el-row>
        <el-col :span="12">
          <div class="grid-content bg-purple" align="left">
            <img src="../assets/logo.png" width="150" height="50 " />
          </div>
        </el-col>
        <el-col :span="12"
          ><div class="grid-content bg-purple-light" align="right">
            <el-button plain>登录</el-button>
            <el-button plain>注册</el-button>
          </div></el-col
        >
      </el-row>
    </el-header>
    <el-main>
      <el-row>
        <!-- 左边 -->
        <el-col :span="8"><div class="grid-content bg-purple">
          <img class="proimg" :src='pro.pimg' />

          
          
          </div></el-col>

        <!-- 右边 -->
        <el-col :span="16"><div class="grid-content bg-purple-light">
          <el-row>
            <el-col :span="12"><div class="grid-content bg-purple" align="right"><h3>商品名称：</h3></div></el-col>
            <el-col :span="12"><div class="grid-content bg-purple-light"><h3>{{pro.pname}}</h3></div></el-col>
          </el-row>
          <el-row>
            <el-col :span="12"><div class="grid-content bg-purple" align="right"><h3>商品价格：</h3></div></el-col>
            <el-col :span="12"><div class="grid-content bg-purple-light"><h3>{{pro.price}}</h3></div></el-col>
          </el-row>
          <el-row>
            <el-col :span="12"><div class="grid-content bg-purple" align="right"><h3>商品数量：</h3></div></el-col>
            <el-col :span="12"><div class="grid-content bg-purple-light"><el-input v-model="count" placeholder="请输入内容"></el-input></div></el-col>
          </el-row>
          <el-row>
            <el-col :span="24"><div class="grid-content bg-purple">
            <el-button type="danger" @click="toCart()">加入购物车</el-button></div></el-col>
          </el-row>
          
          
          </div></el-col>
        </el-row>
        <!-- 详情 -->
        <el-row>
        <el-col :span="24"><div class="grid-content bg-purple">
          
          
          
          </div></el-col>
      </el-row>


    </el-main>
  </el-container>
</template>

<script>
export default {
    data(){
        return{
          pid:this.$route.params.pid,
          pro:null,
          count:1
        }
    },
    methods:{
      getProduct(){
        var vm = this;
        this.axios({
          method:'GET',
          url:'http://localhost:8089/product/getProduct?pid='+vm.pid
        }).then(function(resp){
          vm.pro = resp.data;
        });
      },
      toCart(){
        var vm = this;
        this.axios({
          method:'GET',
          url:'http://localhost:8089/cart/addCart?userId=2020&pid='+vm.pro.pid+"&pcount="+vm.count
        });
        this.$router.push({name:'Cart',params:{userId:2020}});
      }  
    },
    created(){
      this.getProduct();
    }


};
</script>

<style scoped>
.proimg{
  width: 400px;
  height: 450px;
}
.el-header,
.el-footer {
  
  margin-top: 10px;
  background-color: #ffffff;
  color: #333;
  text-align: center;
  height: 60px;
}

.el-main {
  background-color: #e9eef3;
  color: #333;
  text-align: center;
  line-height: 160px;
}

body > .el-container {
  margin-bottom: 40px;
}
</style>
