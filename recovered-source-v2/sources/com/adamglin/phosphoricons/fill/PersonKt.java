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

/* compiled from: Person.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Person", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPerson", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_person", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonKt {
    private static ImageVector _person;

    public static final ImageVector getPerson(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _person;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Person", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(100.0f, 36.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.42f, 140.78f);
        pathBuilder.lineToRelative(-45.25f, -51.3f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -21.0f, -9.48f);
        pathBuilder.horizontalLineTo(106.83f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -21.0f, 9.48f);
        pathBuilder.lineToRelative(-45.25f, 51.3f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, 22.69f);
        pathBuilder.lineTo(89.0f, 142.7f);
        pathBuilder.lineToRelative(-19.7f, 74.88f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.08f, 13.35f);
        pathBuilder.lineTo(128.0f, 180.0f);
        pathBuilder.lineToRelative(29.58f, 51.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.08f, -13.35f);
        pathBuilder.lineTo(167.0f, 142.7f);
        pathBuilder.lineToRelative(25.9f, 20.77f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, -22.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _person = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
