<template>
  <div id="app">
    <h1>간단한 게시판</h1>
    <!-- 게시물 목록 -->
    <div v-if="posts.length > 0">
      <ul>
        <li v-for="(post, index) in posts" :key="index">
          <strong>{{ post.title }}</strong>
          <p>{{ post.content }}</p>
        </li>
      </ul>
    </div>
    <div v-else>
      <p>게시물이 없습니다.</p>
    </div>
    <!-- 새로운 게시물 작성 양식 -->
    <div>
      <h2>새로운 게시물 작성</h2>
      <input type="text" v-model="newPost.title" placeholder="제목">
      <textarea v-model="newPost.content" placeholder="내용"></textarea>
      <button @click="addPost">작성하기</button>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      posts: [],
      newPost: { title: '', content: '' }
    }
  },
  methods: {
    addPost () {
      if (this.newPost.title.trim() && this.newPost.content.trim()) {
        this.posts.push({
          title: this.newPost.title,
          content: this.newPost.content
        })
        this.newPost.title = ''
        this.newPost.content = ''
      } else {
        alert('제목과 내용을 모두 입력해주세요.')
      }
    }
  }
}
</script>

<style>
#app {
  font-family: Arial, sans-serif;
  text-align: center;
  margin-top: 50px;
}
input, textarea {
  width: 100%;
  margin-bottom: 10px;
  padding: 5px;
}
button {
  padding: 10px 20px;
  background-color: #007bff;
  color: #fff;
  border: none;
  cursor: pointer;
  border-radius: 5px;
}
button:hover {
  background-color: #0056b3;
}
</style>
