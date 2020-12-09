<template>
  <div class="login-box">
    <el-form ref="form" :model="form" :rules="rules" label-width="80px">
      <h3 class="login-title">欢迎登陆</h3>

      <el-form-item label="手机号码" prop="userTel">
        <el-input v-model="form.userTel" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="userPwd">
        <el-input
          v-model="form.userPwd"
          type="password"
          placeholder="请输入密码"
        ></el-input>
      </el-form-item>

      <el-form-item align="center">
        <el-button type="primary" @click="onSubmit('form')">登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        userTel: "",
        userPwd: "",
      },

      rules: {
        name: [
          { required: true, message: "请输入用户名", trigger: "blur" },
          { min: 3, max: 8, message: "长度在 3 到 12 个字符", trigger: "blur" },
        ],
        password: [
          { required: true, message: "请输入密码", trigger: "blur" },
          { min: 3, max: 8, message: "长度在 3 到 8 个字符", trigger: "blur" },
        ],
      },
    };
  },
  methods: {
    onSubmit(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          var that = this;
          console.log(that.form.name);
          this.axios({
            method: "get",
            url: "http://localhost:8089/user/login?userTel="+that.form.userTel+"&userPwd="+that.form.userPwd
          }).then(function(resp){
            console.log(resp);
            if(resp.data.result){
                //成功跳转Home页面
                sessionStorage.setItem("isLogin","true");
                //往vuex存放一个user对象
                that.$store.dispatch('asyncUpdateUser', resp.data.data); 
                that.$router.push("/home");
            }else{
              that.$message.error('用户名或密码不正确');
            }
          })
        } else {
          this.$message.error("用户名或密码格式不正确");
          return false;
        }
      });
    },
  },
};
</script>

<style scoped>
.login-box {
  width: 500px;
  height: 300px;
  border: 1px solid #dcdfe6;
  margin: 150px auto;
  padding: 20px 50px 20px 30px;
  border-radius: 20px;
  box-shadow: 10px 10px 5px #888888;
}
.login-title {
  text-align: center;
}
</style>
