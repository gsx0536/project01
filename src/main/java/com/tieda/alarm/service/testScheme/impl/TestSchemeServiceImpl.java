package com.tieda.alarm.service.testScheme.impl;

import com.alibaba.fastjson.JSON;
import com.tieda.alarm.entity.testScheme.TestScheme;
import com.tieda.alarm.entity.testSchemePerson.TestSchemePerson;
import com.tieda.alarm.entity.testSchemeProject.TestSchemeProject;
import com.tieda.alarm.entity.user.User;
import com.tieda.alarm.mapper.testScheme.TestSchemeMapper;
import com.tieda.alarm.mapper.testSchemePerson.TestSchemePersonMapper;
import com.tieda.alarm.mapper.testSchemeProject.TestSchemeProjectMapper;
import com.tieda.alarm.service.testScheme.ITestSchemeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.util.IdWorker;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-12-11
 */
@Service
@Transactional
        public class TestSchemeServiceImpl extends ServiceImpl<TestSchemeMapper, TestScheme>implements ITestSchemeService {


        @Autowired
    TestSchemeMapper testSchemeMapper;
    @Autowired
    TestSchemePersonMapper testSchemePersonMapper;

    @Autowired
    TestSchemeProjectMapper testSchemeProjectMapper;

    @Autowired
    IdWorker idWorker;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestScheme
         */
        @Override
        public TestScheme getTestSchemeById(Long id){
        return testSchemeMapper.getTestSchemeById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestScheme>
         */
        @Override
        public List<TestScheme>getTestSchemeList(Map<String,Object>params){
        return testSchemeMapper.getTestSchemeList(params);
        }



    /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestScheme(HttpServletRequest request, Map param) {
            TestScheme scheme=new TestScheme();
            scheme.setId(String.valueOf(idWorker.nextId()));
            scheme.setName((String)param.get("name"));
            scheme.setControl((String)param.get("control"));
            scheme.setMethod((String)param.get("method"));
            scheme.setPre((String)param.get("pre"));
            scheme.setStatus((String)param.get("status"));
            scheme.setStep((String)param.get("step"));
            scheme.setType((String)param.get("type"));
            User user=(User)request.getSession().getAttribute(User.USER_SESSION_NAME);
            String vcorgid=user.getVcOrgId();
            scheme.setVcorgid(vcorgid);
            testSchemeMapper.addTestScheme(scheme);

            List data=(List)param.get("person");
            List<TestSchemePerson> personList = JSON.parseArray(JSON.toJSONString(data),TestSchemePerson.class);
            for (TestSchemePerson person:personList){
              person.setId(String.valueOf(idWorker.nextId()));
              person.setSchemeid(scheme.getId());
            }
            testSchemePersonMapper.addBatchTestSchemePerson(personList);

            List dataProject=(List)param.get("project");
            List<TestSchemeProject> projectList = JSON.parseArray(JSON.toJSONString(dataProject), TestSchemeProject.class);
            for (TestSchemeProject project:projectList){
                project.setId(String.valueOf(idWorker.nextId()));
                project.setSchemeid(scheme.getId());
            }
            testSchemeProjectMapper.addBatchTestSchemeProject(projectList);

        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestScheme(List<TestScheme>list){
    testSchemeMapper.addBatchTestScheme(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestScheme(TestScheme obj){
    testSchemeMapper.updateTestScheme(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestScheme(List<TestScheme>list){
    testSchemeMapper.updateBatchTestScheme(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestSchemeById(Long id){
    testSchemeMapper.deleteTestSchemeById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestScheme(List<Long>ids){
    testSchemeMapper.deleteBatchTestScheme(ids);
        }

        }
