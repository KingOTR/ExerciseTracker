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

/* compiled from: Personsimplesnowboard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSnowboard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPersonSimpleSnowboard", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSnowboard", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplesnowboardKt {
    private static ImageVector _personSimpleSnowboard;

    public static final ImageVector getPersonSimpleSnowboard(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _personSimpleSnowboard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleSnowboard", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.0f, 52.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 136.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(223.67f, 122.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.93f, 5.42f);
        pathBuilder.lineToRelative(-79.07f, -23.26f);
        pathBuilder.lineToRelative(-7.78f, 11.67f);
        pathBuilder.lineToRelative(35.33f, 10.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.42f, 12.14f);
        pathBuilder.lineToRelative(-19.75f, 29.44f);
        pathBuilder.lineToRelative(50.89f, 14.75f);
        pathBuilder.arcTo(25.32f, 25.32f, 0.0f, false, true, 216.0f, 206.81f);
        pathBuilder.arcTo(25.28f, 25.28f, 0.0f, false, true, 190.79f, 232.0f);
        pathBuilder.arcToRelative(25.88f, 25.88f, 0.0f, false, true, -7.14f, -1.0f);
        pathBuilder.lineTo(26.21f, 185.35f);
        pathBuilder.arcTo(25.32f, 25.32f, 0.0f, false, true, 8.0f, 161.18f);
        pathBuilder.arcTo(25.25f, 25.25f, 0.0f, false, true, 40.34f, 137.0f);
        pathBuilder.lineToRelative(44.73f, 13.0f);
        pathBuilder.lineToRelative(33.52f, -50.28f);
        pathBuilder.lineToRelative(-40.85f, -12.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.52f, -15.35f);
        pathBuilder.lineToRelative(136.0f, 40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 223.67f, 122.25f);
        pathBuilder.close();
        pathBuilder.moveTo(117.58f, 130.0f);
        pathBuilder.lineToRelative(-16.4f, 24.6f);
        pathBuilder.lineToRelative(29.58f, 8.58f);
        pathBuilder.lineToRelative(16.49f, -24.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSnowboard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
