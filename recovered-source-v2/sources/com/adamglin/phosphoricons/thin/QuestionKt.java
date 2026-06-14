package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Question.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Question", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getQuestion", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_question", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionKt {
    private static ImageVector _question;

    public static final ImageVector getQuestion(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _question;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Question", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.0f, 180.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 76.0f);
        pathBuilder.curveToRelative(-19.85f, 0.0f, -36.0f, 14.36f, -36.0f, 32.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -13.23f, 12.56f, -24.0f, 28.0f, -24.0f);
        pathBuilder.reflectiveCurveToRelative(28.0f, 10.77f, 28.0f, 24.0f);
        pathBuilder.reflectiveCurveToRelative(-12.56f, 24.0f, -28.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.2f);
        pathBuilder.curveToRelative(18.0f, -1.77f, 32.0f, -15.36f, 32.0f, -31.8f);
        pathBuilder.curveTo(164.0f, 90.36f, 147.85f, 76.0f, 128.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 128.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, false, -92.0f, 92.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _question = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
