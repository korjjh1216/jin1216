 <template>
    <div id="QnA">
      <h2>QnA List</h2>
      <qnA-list :QnA="QnAs"/>
      <router-link :to="{ name: 'QnARegisterPage' }">
        질문등록 <!--아직 안만듬-->
      </router-link>
    </div>
 </template>


<script>
import QnAList from "../components/QnAList";
import{mapState,mapActions} from "vuex"

export default {
  name: "QnAListPage",
  components: {
    QnAList
  },
  computed: {
    ...mapState(['QnAs'])
  },
  mounted () {
    this.fetchBoardList()
  },
  methods: {
    ...mapActions(['fetchBoardList'])
  }
}
</script>

<style scoped>

</style>