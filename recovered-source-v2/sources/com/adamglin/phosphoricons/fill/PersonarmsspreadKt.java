package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personarmsspread.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonArmsSpread", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPersonArmsSpread", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personArmsSpread", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonarmsspreadKt {
    private static ImageVector _personArmsSpread;

    public static final ImageVector getPersonArmsSpread(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _personArmsSpread;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonArmsSpread", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(100.0f, 36.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.6f, 92.57f);
        pathBuilder.arcTo(15.7f, 15.7f, 0.0f, false, false, 212.0f, 80.0f);
        pathBuilder.horizontalLineTo(44.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.7f, 30.53f);
        pathBuilder.lineToRelative(0.06f, 0.0f);
        pathBuilder.lineToRelative(53.89f, 23.73f);
        pathBuilder.lineToRelative(-21.92f, 83.3f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.9f, 20.91f);
        pathBuilder.arcTo(15.83f, 15.83f, 0.0f, false, false, 84.0f, 240.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.44f, -9.06f);
        pathBuilder.lineTo(128.0f, 180.0f);
        pathBuilder.lineToRelative(29.58f, 51.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.07f, -13.35f);
        pathBuilder.lineToRelative(-21.92f, -83.3f);
        pathBuilder.lineToRelative(54.0f, -23.76f);
        pathBuilder.arcTo(15.7f, 15.7f, 0.0f, false, false, 227.6f, 92.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personArmsSpread = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
