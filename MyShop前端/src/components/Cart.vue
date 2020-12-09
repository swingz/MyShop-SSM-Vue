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

  <el-table
    ref="multipleTable"
    :data="tableData"
    tooltip-effect="dark"
    style="width: 100%"
    @selection-change="handleSelectionChange">
    <el-table-column
      type="selection"
      width="55">
    </el-table-column>
    <el-table-column
        prop="pname"
      label="商品名称"
      width="220">
    </el-table-column>
    <el-table-column
      prop="price"
      label="商品价格"
      width="220">
    </el-table-column>
    <el-table-column
      prop="pcount"
      label="商品数量"
      show-overflow-tooltip>
    </el-table-column>
  </el-table>
  <div align='left'><h2>订单金额:{{totalMoney}}</h2></div>

  <div>
    <el-form ref="form" label-width="80px">
      <el-form-item label="收件人">
        <el-input v-model="orderUser"></el-input>
      </el-form-item>
      <el-form-item label='联系电话'>
        <el-input v-model="orderTel"></el-input>
      </el-form-item>
      <el-form-item label="收件地址">
        <el-input v-model="orderAddr"></el-input>
      </el-form-item>
    </el-form>
  </div>

  <div style="margin-top: 20px">
    <el-button class="el-button--danger" @click="createOrder">提交订单</el-button>
    <el-button class="el-button--success">返回</el-button>
  </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
data() {
      return {
      
        tableData:[],
        multipleSelection: [],
        totalMoney:0,
        orderUser:'',
        orderTel:'',
        orderAddr:'',
      }
    },

    methods: {
      getList(){
        var vm = this;
        this.axios({
          method:'GET',
          url:'http://localhost:8089/cart/cartList?userId='+this.$route.params.userId
        }).then(function(resp){
          vm.tableData = resp.data;
        });
      },
      
      handleSelectionChange(val) {
          this.multipleSelection = val;
          this.totalMoney = 0;
          this.multipleSelection.forEach(row => {
            console.log(row);
            this.totalMoney  += row.price*row.pcount;

          });
        },
      createOrder(){
          
        }



    },
    created(){
      this.getList();
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
  height: 60px;
}

.el-main {
  background-color: #e9eef3;
  color: #333;
  text-align: center;
  /* line-height: 160px; */
}

body > .el-container {
  margin-bottom: 40px;
}
</style>