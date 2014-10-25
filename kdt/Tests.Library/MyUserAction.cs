namespace Tests.Library
{
    using Test.Framework.Core.Flow;
    using Test.Framework.Core.Logging;

    public class MyUserAction
    {
        /// <summary>
        /// 
        /// </summary>
        /// <parameter name="myparameter" />
        public void UserAction(Parameters param)
        {
            string parameter = param.StepParameters["myparameter"].ToString();
            TestLogger.GetLogger().Info("UserAction Test. Parameter: " + parameter);
        }
    }
}
