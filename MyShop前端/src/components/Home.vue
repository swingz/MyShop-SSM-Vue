<template>
  
    <el-container>
      <el-header height="60px">
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
        <div class="block">
          <el-carousel indicator-position="none" height="350px">
            <el-carousel-item v-for="item in imgs" :key="item">
              <img :src="item" />
            </el-carousel-item>
          </el-carousel>
        </div>

        <div class="products">
          <div v-for="pro in pros" :key="pro.tp_id" class="product">
            <img :src="pro.pimg" />
            <br />
            <h4>{{ pro.pname }}</h4>
            <h4>{{ pro.price }}</h4>
            <el-button type="primary" round @click="gtproinfo(pro.pid)">立即购买</el-button>
          </div>
        </div>
      </el-main>
      <el-footer height="260px">Footer</el-footer>
    </el-container>
</template>

<script>
export default {
    
  components: {},
  data() {
    return {
      imgs: ["../static/b1.jpg", "../static/b2.jpg", "../static/b3.jpg"],
      pros: null,
      userId:this.$store.getters.getUser.userId
    };
  },
  created(){
    this.getList();
  },
  methods:{
    getList(){
      var vm = this;
      this.axios({
        method:'GET',
        url:'http://localhost:8089/product/list'
      }).then(function(resp){
        vm.pros = resp.data;
      });
    },
    gtproinfo(pid){
        console.log(pid);
        this.$router.push("/productinfo/"+pid);
    }
  }

}
</script>

<style scoped>

.el-header,
.el-footer {
  margin-top: 10px;
  background-color: #ffffff;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-main {
  background-color: #e9eef3;
  color: #333;
  text-align: center;
  /* line-height: 560px; */
  /* height: 800px; */
  padding: 10px 0px 10px 0px;
}

body > .el-container {
  margin-bottom: 40px;
}

/* 轮播 */
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 150px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: #d3dce6;
}

.product {
  display: inline-block;
  width: 30%;
}

.product img {
  width: 300px;
  height: 350px;
}
</style>